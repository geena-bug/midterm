package sim2;

public class Shop {
    private String title;
    private String[] owners;
    private Shop[] adjacentShops;

    public Shop(String title) {
        this.title = title;
        this.owners = new String[0];
        this.adjacentShops = new Shop[0];
    }

    public Shop(String title, String owner) {
        this.title = title;
        this.owners = new String[]{owner};
        this.adjacentShops = new Shop[0];
    }

    public Shop(String title, String owner, Shop adjacentShop) {
        this.title = title;
        this.owners = new String[]{owner};
        this.adjacentShops = new Shop[]{adjacentShop};
    }

    public String getTitle() {
        return title;
    }

    public String[] getOwnerList() {
        return owners;
    }

    public Shop[] getAdjacentShops() {
        return adjacentShops;
    }

    public boolean addAdjacent(Shop adjacentShop) {
        // Check if the adjacentShop already exists
        for (Shop shop : adjacentShops) {
            if (shop == adjacentShop) {
                return false;
            }
        }


        Shop[] updatedAdjacentShops = new Shop[adjacentShops.length + 1];
        System.arraycopy(adjacentShops, 0, updatedAdjacentShops, 0, adjacentShops.length);
        updatedAdjacentShops[adjacentShops.length] = adjacentShop;
        adjacentShops = updatedAdjacentShops;

        return true;
    }

    @Override
    public String toString() {
        return "Shop: " + title;
    }
}
