
import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        branches = new ArrayList<Branch>();
        this.name = name;
    }

    public Branch getBranch(int id) {
        for (Branch branch : branches) {
            if (branch.getId() == id) {
                return branch;
            }
        }

        return null;
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public void removeBranch(int id) {
        Branch branch = getBranch(id);

        if (branch != null) {
            branches.remove(branch);
            System.out.println("Branch removed");
        }
        else {
            System.out.println("Branch not found");
        }
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
