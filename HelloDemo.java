import Jedis.client.redis.Jedis;
pluble class HelloDemo{
    public static void main(String[] args){
        System.out.println("Hello Demo java"); 
        Jedis jedis = new Jedis("192.168.99.140",7379);
    }
}
