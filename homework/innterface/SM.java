package homework.innterface;

public class SM implements Person, Emp {

    public void setPerson() {
        System.out.println("set person called");
    }

    public void dispPerson() {
        System.out.println("Disp person called");
    }

    public void setSM() {
        System.out.println("set sm called");
    }

    public void dispSM() {
        System.out.println("disp sm called");
    }

   
    @Override
    public void setEmp() {
        // TODO Auto-generated method stub
        System.out.println("set emp called");
    }

    @Override
    public void dispEmp() {
        // TODO Auto-generated method stub
        System.out.println("dispemp called");
    }
}

