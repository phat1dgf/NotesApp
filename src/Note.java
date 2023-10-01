public class Note {
    private String NoteName;
    private String NoteContent;
    Note next;

    public Note(String NoteName, String NoteContent) {
        this.NoteContent = NoteContent;
        this.NoteName = NoteName;
    }

    public String getNoteName() {
        return NoteName;
    }

    public String getNoteContent() {
        return NoteContent;
    }

    public void setNoteName(String NoteName) {
        this.NoteName = NoteName;
    }

    public void setNoteContent(String NoteContent) {
        this.NoteContent = NoteContent;
    }
}
