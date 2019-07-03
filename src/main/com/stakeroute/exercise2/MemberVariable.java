package com.stakeroute.exercise2;
class Member{

    //Instance variable of the class
    String name;
    int age;
    float salary;
}

public class MemberVariable {

    //Creating object of the class
    Member member=new Member();
    String output="";

    //Setting the value to the instance variable
    public String isSet(String name,int age,float salary){
        member.name=name;
        member.age=age;
        member.salary=salary;
        output=output+"Members name:"+member.name+"\n";
        output=output+"Members age:"+member.age+"\n";
        output=output+"Members salary:"+member.salary;

        return output;
    }

}
