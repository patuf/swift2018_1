package Task4;

import Common.Scan;

public class Task4d_SumNumbersInString
{
    public static void main(String[] args)
    {
        String input = Scan.scanString();

        char[] inputChatArray = input.toCharArray();

        String[] numbers = new String[inputChatArray.length*2];


        for (int i = 0; i < inputChatArray.length; i++)
        {
            if ((int)inputChatArray[i] >47 && (int)inputChatArray[i] < 58)
            {
                numbers[i] = "" + inputChatArray[i];
                int temp = i+1;
                while (true)
                {
                    if ((int)inputChatArray[temp] >47 && (int)inputChatArray[temp] < 58)
                    {
                        numbers[i] += inputChatArray[temp];
                        temp++;
                    }
                    else
                    {
                        i = temp;
                        break;
                    }

                }
            }

        }

        int sum = 0;

        for (String s: numbers)
        {
            if (s != null)
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
