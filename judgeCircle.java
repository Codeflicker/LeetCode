class Solution {
    public boolean judgeCircle(String moves) {
		int moveCountVerticle = 0;
		int moveCountHorizontal  = 0;
        boolean status;
		final char MOVE_UP = 'U';
		final char MOVE_DOWN = 'D';
		final char MOVE_LEFT = 'L';
		final char MOVE_RIGHT = 'R';
		
		char[] movesArray = moves.toCharArray();
		
		for(final char move : movesArray) {
			switch (move) {
			case MOVE_UP:
				moveCountVerticle++;
				break;
				
			case MOVE_DOWN:
				moveCountVerticle--;
				break;
				
			case MOVE_LEFT:
				moveCountHorizontal++;
				break;
				
			case MOVE_RIGHT:
				moveCountHorizontal--;
				break;
			}
		}
		
		if(moveCountVerticle == 0 && moveCountHorizontal == 0) {
			status = true;
		}else {
			status  = false;
		} 
        
        return status;
    }
}
