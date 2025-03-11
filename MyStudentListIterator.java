package designPatternStudy;

public class MyStudentListIterator implements Iterator {
    protected MyStudentList myStudentList;
    protected int index;

    public MyStudentListIterator(MyStudentList list) {
        this.myStudentList = list;
        this.index = 0;
    }

    public boolean hasNext() {
        if (myStudentList.getLasutNum() > index) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s;
    }
}
