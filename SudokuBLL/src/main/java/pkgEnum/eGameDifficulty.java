package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {

		EASY(100), MEDIUM(500), HARD(1000);
		
		private final int iDifficultyValue;
		private static final Map<Integer,eGameDifficulty> lookup = new HashMap<Integer,eGameDifficulty>();
		
		static {

			for(eGameDifficulty e : eGameDifficulty.values()) {
				lookup.put(e.getiDifficulty(),e);
			}
		}
		private eGameDifficulty(int x) {
			this.iDifficultyValue = x;
		}
		public int getiDifficulty(){
			return iDifficultyValue;
		}
		public static eGameDifficulty get(int Diff) {
			eGameDifficulty eGDSetValue = null;
			for(eGameDifficulty eGD: eGameDifficulty.values()) {
				if(eGD.iDifficultyValue <= Diff) {
					eGDSetValue = eGD;
				}
			}
			return eGDSetValue;
		}
		
		
		
		
		
		
	}