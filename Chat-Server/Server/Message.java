

public class Message {

    private String name;
    private String message;
    private String id;
    private boolean deleted = false;
    private boolean changed = false;
    private String request;

    public Message(String string, String create_markup, String b) {
        this.name = string;
        this.message = create_markup;
        this.id = b;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String toString() {
        return "{\"name\":\"" + this.name + "\",\"message\":\"" + this.message + "\",\"id\":" + this.id + "}";
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public String getRequest() {
        return request;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public boolean isChanged() {
        return changed;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Message other = (Message) obj;
        if (id != other.id)
            return false;

        return true;
    }
}
