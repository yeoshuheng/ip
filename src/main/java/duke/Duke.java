package duke;


/**
 * This class represents a running instance of Duke, the task list!
 */
public class Duke {

    private Storage manager;

    private Parser parser;

    private TaskList history;

    private Ui ui;

    /**
     * Constructor for duke application.
     */
    public Duke() {
        this.manager = new Storage("data");
        this.manager.createLog();
        this.parser = new Parser();
        this.history = new TaskList(this.manager);
        this.ui = new Ui(manager, parser, history);
    }

    /**
     * Getter for UI.
     * @return UI for the chatbot.
     */
    public Ui getUi() {
        return this.ui;
    }
    /**
     * Getter for parser.
     * @return The parser.
     */
    public Parser getParser() {
        return this.parser;
    }
}
