package listeners;

import exceptions.NameException;
import exceptions.NullObjectException;

public interface CommandListener {

	public abstract void showMenu();

	public abstract void execute(int command) throws NullObjectException, NameException;

}
