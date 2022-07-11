public class Les1a4 { public static void main (String[] args)
{System.out.println("salary decreasing");
    byte month=8;
    int salary=10000;
    while (salary>-1)
    {month++;
        System.out.println("In begining " + month + " month salary is " + salary);
        salary=salary-1000;}
    salary=10000;
    month=0;
    do
    {month++;
        System.out.println("i can do my job while my salary per " + month + " month amount to " + salary);
        salary=salary-1000;}
    while (salary>=0);
       month=0;
    for (salary = 10000; salary >-1; salary=salary-1000)
    {month++;
        System.out.println("i can do my job to month " + month + " for salary " + salary);}
}
}
