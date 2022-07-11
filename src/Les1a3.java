public class Les1a3 {public static void main (String[] args)
{byte month=8;
    int salary=666;
    while (month<12)
    {salary=salary+1000;
        month++;
        System.out.println("1 year month " + month + " salary " + salary);}
    month=0;
    do {salary=salary+1000;
        month++;
        System.out.println("2 year month " + month + "salary " + salary);}
    while (month<12);
    for (month = 1; month <= 12; month++)
    {salary = salary + 1000;
        System.out.println("3 year month " + month + " salary " + salary);}
}
}
