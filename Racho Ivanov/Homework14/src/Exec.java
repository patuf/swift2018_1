import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

public class Exec
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		final String connectionString = "jdbc:mysql://localhost:3306/school";
		final String user = "root";
		final String password = "PASS4root";

		Scanner scn = new Scanner(System.in);
		String[] inputs;

		MySQLConnection con = new MySQLConnection(connectionString, user,password);

		ResultSet rset;

		mainloop:
		while (true)
		{
			System.out.println();
			System.out.println("You may chose between the following options :");
			System.out.println("1. Add new teacher to the database.");
			System.out.println("2. Find teacher info by id.");
			System.out.println("3. Get all teachers within salary range.");
			System.out.println("4. Add new student to database.");
			System.out.println("5. Find student by id.");
			System.out.println("6. Find students who enrolled after.");
			System.out.println("7. Find all disciplines a teacher is teaching.");
			System.out.println("8. Find all teachers teaching certain discipline by id.");
			System.out.println();

			int choice = scn.nextInt();

			switch (choice)
			{
				case 1:
					System.out.println("Enter new teacher's name email and salary in that order");
					inputs = new String[3];

					for (int i = 0; i < inputs.length; i++)
						inputs[i] = scn.next();

					con.execQuerry("insert into teachers(name, email, salary) values(inputs[0], inputs[1], inputs[2])");
					break;

				case 2:
					System.out.println("Enter id :");
					rset = con.execQuerry("select * from teachers where id = " + scn.nextInt());
					while (rset.next())
						System.out.println(rset.getString(2) + ' ' + rset.getString(3));
					break;
				case 3:
					System.out.println("Enter lower range of salary and then higher:");
					inputs = new String[2];
					inputs[0] = scn.next();
					inputs[1] = scn.next();

					rset = con.execQuerry("select * from teachers where salary between" + inputs[0] + " and " + inputs[1]);
					while (rset.next())
						System.out.println(rset.getString(2) + ' ' + rset.getString(3));
					break ;
				case 4:
					// TODO: 25.3.2018 г. use local date time
					System.out.println("Enter new students name and today;s date in that order");
					inputs = new String[2];

					for (int i = 0; i < inputs.length; i++)
						inputs[i] = scn.next();

					con.execQuerry("insert into STUDENTS(name, enrolment_date) values(inputs[0], inputs[1])");
					break;

				case 5:
					System.out.println("Enter id :");
					rset = con.execQuerry("select * from students where id = " + scn.nextInt());
					while (rset.next())
						System.out.println(rset.getString(2) + ' ' + rset.getString(3));
					break;

				case 6:
					System.out.println("Enter date :");
					inputs = new String[1];
					rset = con.execQuerry("select * from students where enrollment_date > " + inputs[1]);
					while (rset.next())
						System.out.println(rset.getString(2) + ' ' + rset.getString(3));

				case 7:
					System.out.println("Enter teacher id :");
					rset = con.execQuerry("select disciplines.id, disciplines.name " +
									"from disciplines_taught dt " +
									"join disciplines on dt.discipline_id = disciplines.id " +
									"where dt.teacher_id =  " + scn.next());
					while (rset.next())
						System.out.println(rset.getString(2));
					break ;

				case 8:
					System.out.println("Enter discipline name to get teachers :");

					inputs = new String[1];
					inputs[0] = scn.next().toLowerCase();
					inputs[0] = inputs[0].substring(0,1).toUpperCase() + inputs[0].substring(1);

					rset = con.execQuerry("select * " +
									"from teachers t " +
									"join disciplines_taught dt on dt.teacher_id = t.id " +
									"join disciplines d on d.id = dt.discipline_id " +
									"where d.name = '" + inputs[0] + "'");
					while (rset.next())
					{
						for (int i = 2; i < 5; i++)
						{
							System.out.print(rset.getString(i) + ' ');
						}
						System.out.println();
					}
					break;

				default:
					System.out.println("Good bye");
					break mainloop;
			}
			scn.nextLine();
			scn.nextLine();
		}
	}


}
