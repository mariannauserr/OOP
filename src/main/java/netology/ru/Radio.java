package netology.ru;
public class Radio {
    private int currentStation;
    private int currentVolume;
 // от 0 до 9
    public void setCurrentStation(int currentStation) {
       if (currentStation < 0) {
           return;
       }
       if (currentStation > 9) {
           return;
       }
       this.currentStation = currentStation;
    }
    //получить значение
    public int getCurrentStation() {
        return currentStation;
    }
    // увеличить на 1
    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation ++;
        }
        // уменьшить на 1
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
        //от 0 до 10
        public void setCurrentVolume(int currentVolume) {
            if (currentVolume < 0) {
                return;
            }
            if (currentVolume > 10) {
                return;
            }
            this.currentVolume = currentVolume;
        }
        // получить значение
        public int getCurrentVolume() {
            return currentVolume;
        }
        // от 1 до 10
        public void volumePlus() {
            if (currentVolume == 10) {
                return;
            }
            currentVolume++;
        }
        //уменьшить -1 до 0
        public void volumeMin() {
            if (currentVolume == 0) {
                return;
            }
            currentVolume--;
        }
    }
}
