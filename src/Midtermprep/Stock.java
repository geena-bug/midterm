package Midtermprep;

    public class Stock {
        private String symbol;
        private String name;
        private double previousClosingPrice;
        private double currentPrice;

        // Constructor
        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        // Getter method for symbol
        public String getSymbol() {
            return symbol;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Setter method for previousClosingPrice
        public void setPreviousClosingPrice(double previousClosingPrice) {
            this.previousClosingPrice = previousClosingPrice;
        }

        // Setter method for currentPrice
        public void setCurrentPrice(double currentPrice) {
            this.currentPrice = currentPrice;
        }

        // Method to calculate and return the percentage change from previousClosingPrice to currentPrice
        public double getChangePercent() {
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        }

        public static void main(String[] args) {
            // Create a Stock object
            Stock oracleStock = new Stock("ORCL", "Oracle Corporation");

            // Set previous closing price
            oracleStock.setPreviousClosingPrice(34.5);

            // Set current price
            oracleStock.setCurrentPrice(34.35);

            // Display the price-change percentage
            System.out.println("Stock Symbol: " + oracleStock.getSymbol());
            System.out.println("Stock Name: " + oracleStock.getName());
            System.out.println("Price Change Percentage: " + oracleStock.getChangePercent() + "%");
        }
    }
