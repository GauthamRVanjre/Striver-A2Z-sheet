class TypeCheck{
    public static void main(String[] args){
        int res = dataTypes("Long");
        System.out.println(res);
    }

    static int dataTypes(String type){
        int ans=0;
        switch(type){

        case "Integer":
        ans=Integer.BYTES;
        break;

        case "Long":
        ans=Long.BYTES;
        break;

        case "Float":
        ans=Float.BYTES;
        break;

        case "Double":
        ans=Double.BYTES;
        break;

        case "Character":
        ans=Character.BYTES-1;
    }

        return ans;
    }
}