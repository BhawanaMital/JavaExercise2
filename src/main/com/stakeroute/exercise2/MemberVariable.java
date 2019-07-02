package com.stakeroute.exercise2;
class Member{
    String name;
    int age;
    float salary;
}

public class MemberVariable {
    Member member=new Member();
    String output="";
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
