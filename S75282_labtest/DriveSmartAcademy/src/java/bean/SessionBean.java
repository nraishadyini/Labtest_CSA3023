package bean;

public class SessionBean {

    private int session_id;
    private String student_name;
    private String branch_location;
    private String lesson_type;
    private String status;

    public SessionBean() {
    }

    public SessionBean(int session_id,
            String student_name,
            String branch_location,
            String lesson_type,
            String status) {

        this.session_id = session_id;
        this.student_name = student_name;
        this.branch_location = branch_location;
        this.lesson_type = lesson_type;
        this.status = status;
    }

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getBranch_location() {
        return branch_location;
    }

    public void setBranch_location(String branch_location) {
        this.branch_location = branch_location;
    }

    public String getLesson_type() {
        return lesson_type;
    }

    public void setLesson_type(String lesson_type) {
        this.lesson_type = lesson_type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}