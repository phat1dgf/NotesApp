import java.util.Scanner;

class LinkedListNote {
    Note head;
    int i = 1;

    public LinkedListNote() {
        head = null;
    }

    Scanner scanner = new Scanner(System.in);


    public String content() {
        System.out.println("Enter note content (type \"exit\" to end): ");
        String content = "";

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break; // Exit the loop if 'exit' is entered
            }
            content = content + line + "\n";
        }

        return content;
    }

    public void isEmpty() {
        if (head == null) {
            System.out.println("There isn't any yet");
        }
    }

    public String name() {
        System.out.println("Enter note name: ");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            name = "Note " + i + ": ";
            i++;
        }
        return name;
    }

    public void addNote() {
        Note newNote = new Note(name(), content());
        if (head == null) {
            head = newNote;
        } else {
            Note cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNote;
        }
    }

    public void display() {
        isEmpty();
        Note cur = head;
        while (cur != null) {
            System.out.println(cur.getNoteName());
            System.out.println(cur.getNoteContent());
            cur = cur.next;
        }
    }

    public void update(String nameNote) {
        isEmpty();
        Note cur = head;
        while (cur.next != null) {
            if (nameNote.equals(cur.getNoteName())) {
                break;
            }
            cur = cur.next;
        }
        cur.setNoteName(name());
        cur.setNoteContent(content());
    }

    public void delete(String nameNote) {
        Note cur = head;
        Note newCur = head;
        isEmpty();
        while (cur.next != null) {
            if (nameNote.equals(cur.getNoteName())) {
                break;
            }
            cur = cur.next;
        }
        if (cur == head) {
            head = cur.next;
        }
        if (cur != head && cur.next != null) {
            while (newCur.next != cur) {
                newCur = newCur.next;
            }
            newCur.next = cur.next;
        }
        if (cur.next == null) {
            while (newCur.next != cur) {
                newCur = newCur.next;
            }
            newCur.next = null;
        }
    }


//    File file = new File("C:\\Users\\Phat\\Documents\\Java\\NoteApp\\save.txt");
//
//    public void save() {
//        try {
//            Note cur = head;
//            OutputStream os = new FileOutputStream(file);
//            ObjectOutputStream oos = new ObjectOutputStream(os);
//            while (cur != null) {
//                oos.writeObject(cur);
//                cur = cur.next;
//            }
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void read() {
//        try {
//            InputStream is = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(is);
//            Note savedNote = null;
//            while (true) {
//                savedNote = (Note) ois.readObject();
//                if (savedNote != null) {
//                    Note newNote = new Note(savedNote.getNoteName(), savedNote.getNoteContent());
//                    if (head == null) {
//                        head = newNote;
//                    } else {
//                        Note cur = head;
//                        while (cur.next != null) {
//                            cur = cur.next;
//                        }
//                        cur.next = newNote;
//                    }
//                }
//                if (savedNote == null) break;
//            }
//            ois.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
