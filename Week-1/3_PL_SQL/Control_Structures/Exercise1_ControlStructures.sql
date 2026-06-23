create table customers (
   customerid number primary key,
   customername varchar2(50),
   age number,
   balance number,
   isvip varchar2(5)
);

create table loans (
   loanid number primary key,
   customerid number,
   interestrate number,
   duedate date
);

-- Insert Data

insert into customers values (1,'Ravi',65,15000,'FALSE');
insert into customers values (2,'Kiran',40,7000,'FALSE');
insert into customers values (3,'Arun',70,20000,'FALSE');

insert into loans values (101,1,10,sysdate+15);
insert into loans values (102,2,12,sysdate+40);
insert into loans values (103,3,9,sysdate+20);

commit;

-- Display Tables

select * from customers;

select * from loans;

--------------------------------------------------
-- Scenario 1
-- Discount for customers above 60 years
--------------------------------------------------

set serveroutput on;

begin
   for c in (
      select customerid
      from customers
      where age > 60
   ) loop

      update loans
      set interestrate = interestrate - 1
      where customerid = c.customerid;

   end loop;

   dbms_output.put_line('Interest Discount Applied');
end;
/

select * from loans;

--------------------------------------------------
-- Scenario 2
-- VIP customers
--------------------------------------------------

begin
   for c in (
      select customerid
      from customers
      where balance > 10000
   ) loop

      update customers
      set isvip = 'TRUE'
      where customerid = c.customerid;

   end loop;

   dbms_output.put_line('VIP Updated');
end;
/

select * from customers;

--------------------------------------------------
-- Scenario 3
-- Loan reminders
--------------------------------------------------

begin
   for r in (
      select c.customername,
             l.duedate
      from customers c
      join loans l
      on c.customerid = l.customerid
      where l.duedate between sysdate and sysdate + 30
   ) loop

      dbms_output.put_line(
         'Reminder: ' ||
         r.customername ||
         ' Loan Due On ' ||
         r.duedate
      );

   end loop;
end;
/