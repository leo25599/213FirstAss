public class Tasks {
    private String menu;

    public Tasks(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "menu='" + menu + '\'' +
                '}';
    }
}
