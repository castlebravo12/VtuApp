package model;

/**
 * Created by Pankaj on 10-01-2018.
 */

public class ListItem {
    private String name[];
    private String description;



    public ListItem(String name[],String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        for (int i = 0;i<name.length;i++)
        return name[i];
        return null;
    }

    public void setName(String name[]) {
        for (int i =0;i<name.length;i++) {
            this.name[i] = name[i];
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }
}
