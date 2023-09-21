package discount2;

    public class Discount
    {
        public double addPorto(double value)
        {
            return (value < 100.0) ? 2.0 : 0.0;
        }

        public double getPackaging(double value)
        {
            return (value < 250.0) ? 5.0 : 0.0;
        }
        public double getDiscount(double value)
        {
            return (value < 500.0) ? 0 : (value * 0.05);
        }

    }
