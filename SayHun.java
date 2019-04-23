public class SayHun
{
    private static final String[] tensNames =
            {
                    null, null, "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
            };

    private static final String[] numberNames =
            {
                    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                    "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                    "sixteen", "seventeen", "eighteen", "nineteen"
            };

    public static void main( String[] args ) {
        long inputNumber = Long.parseLong( args[ 0 ] );

        if ( inputNumber < 0 || inputNumber > 999_999_999_999L )
        {
            throw new IllegalArgumentException( "The number must at least zero and less than 1 Trillion" );
        }
        else if ( inputNumber == 0 )
        {
            System.out.print( "zero " );
        }
        else if ( inputNumber > 999)
        {
            convertNumberMoreThanThousand( inputNumber );
        }
        else
        {
            convertNumberLessThanThousand( ( int ) inputNumber );
        }
    }

    public static void convertNumberMoreThanThousand(long input)
    {
        if ( ( input / 1_000_000_000 ) > 0 )
        {
            int billions = ( int ) (input / 1_000_000_000 );
            convertNumberLessThanThousand( billions );
            System.out.print( " billion ");
            input %= 1_000_000_000;
        }
        if ( ( input / 1_000_000 ) > 0 )
        {
            int millions = ( int ) (input / 1_000_000 );
            convertNumberLessThanThousand( millions );
            System.out.print( " million ");
            input %= 1_000_000;
        }
        if ( ( input / 1000 ) > 0 )
        {
            int thousands = ( int ) (input / 1000 );
            convertNumberLessThanThousand( thousands );
            System.out.print( " thousand ");
            input %= 1000;
        }
        convertNumberLessThanThousand ( ( int ) input );
    }

    public static void convertNumberLessThanThousand( int input )
    {
        if (input > 99)
        {
            System.out.print( numberNames[ input / 100 ] + " hundred " );
            input %= 100;
        }
        if ( input < 20 )
        {
            System.out.print( numberNames[ input ] );
        }
        else
        {
            System.out.print( tensNames[ input / 10 ] );
            input %= 10;
            if ( input > 0 )
            {
                System.out.print( "-" + numberNames[ input ] );
            }
        }
    }
}