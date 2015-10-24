class Rectangle 
{ 
       double width; 
       double height; 
       double depth;
    Rectangle ()
    {
        System.out.println(" Constructing Rectangle ");
        width = 10;
        height = 10;
        depth = 10;
     }

    double volume() 
    {
        return width * height * depth;
    }
}
