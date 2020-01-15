import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TextMenu {
    private String menuTitle = "Main Menu";
    private List<String> menuOptions = new ArrayList<>();

    public TextMenu(String menuTitle, List<String> menuOptions) {
        this.menuTitle = menuTitle;
        menuOptions.add(new String("List minions"));
        menuOptions.add(new String("Add a new minion"));
        menuOptions.add(new String("Remove a minion"));
        menuOptions.add(new String("Attribute evil deed to a minion"));
        menuOptions.add(new String("DEBUG: Dump objects (toString)"));
        menuOptions.add(new String("Exit"));
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle;
    }

    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public void setMenuOptions(List<String> menuOptions) {
        this.menuOptions = menuOptions;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "menuTitle='" + menuTitle + '\'' +
                ", menuOptions=" + menuOptions +
                '}';
    }
    public void printMenu(){
        for(int i=0; i<(menuTitle.length()+4); i++){
            System.out.println("*");
        }

        System.out.println("* " + menuTitle + " *");

        for(int i=0; i<(menuTitle.length()+4); i++){
            System.out.println("*");
        }

        for(int i=1; i<=menuOptions.size(); i++){
            System.out.println(i + menuOptions.get(i-1));
        }
    }

}
