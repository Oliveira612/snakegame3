public class Board (
  public void draw(Graphics2D g2) {
  drawGrass(g2);
}

private void drawGrass(Graphics2D g2) {
  int tile = GameConstants.TITLE;
for(int x = 0; x < GameConstats.COLS; x++) {
  for(int y = 0; y < GameConstats.ROWS; y++) {
    boolean shade = (x + y) % 2 == 0;

    g2.setColor(shade   ? new Color(1, 145, 1, 30) : newColor
                (78, 242, 110));
    g2.fillRect(x * tile, y  * title, title, title);
  }
}

}
  
