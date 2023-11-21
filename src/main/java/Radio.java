public class Radio {
    public int currentVolume;
    public int currentRadioStation;
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100){
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }
    /////////////////////////////////////////////////////
    public void nextRadioStation () {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
    }
    public void nextRadioStationMax () {
        if (currentRadioStation>= 9) {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation () {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }

    }
    public void prevRadioStationMin () {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        }
    }
    public void setCurrentRadioStation ( int newCurrentRadioStation){
        if (newCurrentRadioStation > 9) {
            return ;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }


}



