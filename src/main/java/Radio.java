public class Radio {
        public int currentVolume;
        public int getCurrentVolume () {
            return currentVolume;
        }
        public void increaseVolume () {
            if (currentVolume < 100) {
                currentVolume = currentVolume + 1;
            }
        }

        public void reductionVolume () {
            if (currentVolume > 0) {
                currentVolume = currentVolume - 1;
            }
        }

        public void setCurrentVolume ( int newCurrentVolume){
            if (currentVolume == 100) {
                return;
            }
            if (currentVolume == 0) {
                return;
            }
            this.currentVolume = newCurrentVolume;
        }
    }



