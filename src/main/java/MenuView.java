import java.util.Scanner;

public class MenuView {

	private Board board;

	private MenuController menuController;

	public MenuView(MenuController menuController, Board board) {
		this.menuController = menuController;
		this.board = board;
	}

	public void render() {
		new BoardView(board).render();
		System.out.println("--------------------------");
		System.out.println("1. Move from deck to draw");
		System.out.println("2. Move from draw to suit");
		System.out.println("3. Move from draw to rank");
		System.out.println("4. Move from rank to suit");
		System.out.println("5. Move from rank to rank");
		System.out.println("6. Move from suit to rank");
		int menuOption = 0;
		do {
			System.out.print("Option? [1-6]: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			menuOption = in.nextInt();
		} while ((menuOption > 6) && (menuOption < 1));
		menuController.control(menuOption);
	}

}
