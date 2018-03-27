SELECT * FROM school.addresses;

SELECT * FROM school.addresses where country = 'Bulgaria';


call insertAddress('Serbia', 'Dimitrovgrad', 'Kalach', 3, 1, 1);


delimiter //

create procedure insertAddress(in new_country varchar(45), new_city varchar(45), new_street varchar(45),
								new_number int, new_floor int, new_apartmentNo int)
                                
begin

insert into school.addresses (country, city, street, number, floor, apartmentNo) 
			values(new_country, new_city, new_street, new_number, new_floor, new_apartmentNo);
end



