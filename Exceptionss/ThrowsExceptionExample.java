import java.io.IOException;

import javax.sound.sampled.SourceDataLine;

public class ThrowsExceptionExample{
    public static void main(String[] args) throws IOException
    {
        
        try
        {
            throw new IOException();
        }
        catch(IOException e)
        {
            System.out.println("Exception: "+e.getMessage());
        }
}
}


//object and class example below:

// class box
// {
//     public int length;
//     public int breadth;
//     public int height;

//     public void SetDimension(int length, int breadth,int height)
//     {
//         length=l;
//         breadth=b;
//         height=h;
//     }

//     public void ShowDimension()
//     {
//         System.out.println("length: "+length);
//         System.out.println("breadth: "+breadth);
//         System.out.println("height: "+height);
//     }
// }

// class ExceptionExample6{
//     public static void main(String[] args) {
//         {
//             box b = new box();
//             b.SetDimension(12, 13, 14);
//         }
//     }
// }