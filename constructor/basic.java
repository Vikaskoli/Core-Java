package constructor;
class City2
{
    public void m1(){
        System.out.println("Jaipur");
    }
}
class City{
    City2 city2;
    //String cityName;
    public void m1(){
        // System.out.println(cityName);
        city2.m1();
    }
    City(City2 city2)           //This constructor accepts a City2 object as a parameter.
    {
        this.city2=city2;       //and assigns it to the instance variable city2
    }
}
public class basic{

    public static void main(String[] args) {
        City2 city2=new City2();
        City c=new City(city2); //creates an instance of City by passing the city2 object to the City constructor.
                                // This establishes the dependency between City and City2.
        c.m1();
    }
}