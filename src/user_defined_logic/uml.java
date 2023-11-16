package user_defined_logic;

import java.util.Arrays;
public class uml {

    public class Shop {
        private String title;
        private String[] owners;
        private Shop[] adjacentShops;

        // Constructors
        public Shop(String title) {
            this.title = title;
            this.owners = null;
            this.adjacentShops = null;
        }

        public Shop(String title, String owner) {
            this.title = title;
            this.owners = new String[]{owner};
            this.adjacentShops = null;
        }

        public Shop(String title, String owner, Shop adjacentShop) {
            this.title = title;
            this.owners = new String[]{owner};
            this.adjacentShops = new Shop[]{adjacentShop};
        }

        // Methods
        public String getTitle() {
            return title;
        }

        public String[] getOwnerList() {
            return owners;
        }

        public Shop[] getAdjacentShops() {
            return adjacentShops;
        }

        public boolean addAdjacent(Shop adjacentShop)
        {
            if (adjacentShops == null)
            {
                adjacentShops = new Shop[]{adjacentShop};
            }
            else if (adjacentShops.length < 2)
            {
                // Check if the shop is not already adjacent
                for (Shop shop : adjacentShops)
                {
                    if (shop.getTitle().equals(adjacentShop.getTitle()))
                    {
                        return false; // Shop is already adjacent
                    }
                }
                // Add the new adjacent shop
                Shop[] newAdjacentShops = Arrays.copyOf(adjacentShops, adjacentShops.length + 1);
                newAdjacentShops[adjacentShops.length] = adjacentShop;
                adjacentShops = newAdjacentShops;
            }
            else
            {
                return false; // Maximum of 2 adjacent shops reached
            }
            return true;
        }

        public String toString() {
            StringBuilder result = new StringBuilder("Shop Title: " + title + "\nOwners: ");
            if (owners != null) {
                for (String owner : owners) {
                    result.append(owner).append(" ");
                }
            } else {
                result.append("None ");
            }

            result.append("\nAdjacent Shops: ");
            if (adjacentShops != null) {
                for (Shop shop : adjacentShops) {
                    result.append(shop.getTitle()).append(" ");
                }
            } else {
                result.append("None");
            }

            return result.toString();
        }

    }

}
