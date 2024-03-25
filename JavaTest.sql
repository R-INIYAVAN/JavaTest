create database javaprojecttest;
use javaprojecttest;

create table User (
	userid int,
    username varchar(20),
    userpassword varchar(20),
    userrole varchar(20)
);

create table Client(
	clientid int,
    clientname varchar(20),
    contactinfo varchar(30),
    policy varchar(30)
);

create table Claim(
	claimid int,
    claimnumber int,
    datefield varchar(20),
    claimamount double,
    claimstatus varchar(20),
    policy varchar(30),
    clientid int
);

create table Payment(
	paymentid int,
    paymentdate varchar(20),
    paymentamount double,
    clientid int
);