 
 
 
 
 
 
 
 public void remove (String item) { //need to add in code to shift everything down when something is removed
        String[] newLstArray;
        if (size - 1 <= (lstArray.length / 4)) {
            newLstArray = new String[lstArray.length / 2];
            for (int index = 0; index < newLstArray.length; index++) {
                newLstArray[index] = lstArray[index];
            }
            lstArray = newLstArray;
        }
        for (int index = 0; index < lstArray.length; index++)
            if (lstArray[index] == item) {
                lstArray[index] = null;
                for(int spot = index; spot <= size-1; spot++)
                    lstArray[spot] = lstArray[spot+1];
                size--;
                break;
            }
        }
        
        ///working shift code
        
        for (int index = 0; index < lstArray.length; index++) {
                if (lstArray[index] == item) {
                    for (int shift = index; shift < size; shift++) {
                        lstArray[shift] = lstArray[shift + 1];