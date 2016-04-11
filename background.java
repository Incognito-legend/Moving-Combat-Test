import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{
    boolean turn = true;
    boolean hit = false;
    boolean miss = false;
    boolean fssp = false;
    int count_ = 0;
    int count = 0;
    boolean hit_check = false;
    boolean hit_check_df = false;
    
    public background()
    {    
        
        super(600, 400, 1);
        
        addObject(new Player(), 100, 200);
        
        addObject(new Enemy(), 500, 200);
        
        //addObject(new GuessingGameGUI(), 0, 0);
        
    }
    public void setLocation(int _x, int _y)
    {
    }
    public void act()
    {
        if ((turn) && (hit))
        
        {
            
                if (fssp)
                
                {    
                    if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Fireball(), 100, 200);
                                System.out.println("fireball add check");
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                            if (count_ == 10000)
                            
                              {
                                
                                addObject(new Fire_Spell(), 500, 200);
                                                            
                                hit = false;
                                
                                fssp = false;
                                hit_check_df = false;
                                hit_check = false;
                                
                              }
                        
                              count_ = (count_ + 1) % 10001;
                        }
                    }
                }
                else if (!(fssp))
                {
                    count = 0;
                    count_ = 0;
                }
                
        }        
        
       
        if ((!(turn)) && (hit))
            
        {
                                
                if (fssp)
                
                {
                    if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Enemy_Fireball(), 500, 200);
                                System.out.println("fireball add check");
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                            if (count_ == 10000)
                            
                              {
                                
                                addObject(new Fire_Spell(), 100, 200);
                                                            
                                hit = false;
                                
                                fssp = false;
                                hit_check_df = false;
                                hit_check = false;
                                
                              }
                        
                              count_ = (count_ + 1) % 10001;
                        }
                    }
                    
                }
                else if (!(fssp))
                {
                    count_ = 0;
                }                        
        }
        
        if ((turn) && (miss))
        
        {
            
            if (fssp)
            
            {
                if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Fireball(), 100, 200);
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                            
                                
                                        if (count_ == 20000)
                            
                            {
                                
                             turn = false;
                             fssp = false;
                             miss = false;
                             hit_check_df = false;
                                hit_check = false;
                            }                            
                            
                              count_ = (count_ + 1) % 20001;                                                                                               
                        }
                        
                }
            
                     
                    
            }    
            
            else if (!(fssp))
            
            {
                    count_ = 0;
            }    

        }
        
        else if ((!(turn)) && (miss))
                    
            {
            
            if (fssp)
            
            {   
                   
                    if (!(hit_check))
                    {
                        if (!(hit_check_df))
                        {
                            
                             if (count == 10000)
                            
                            {
                                
                                addObject(new Enemy_Fireball(), 500, 200);
                                hit_check_df = true;                            
                            }
                                count = (count + 1) % 10001;
                        }
                    }
                    
                    else if (hit_check)
                    
                    {
                        
                        if (hit_check_df)
                        {

                                     count_ = (count_ + 1) % 20001;
                            if (count_ == 20000)
                            
                            {
                                
                             turn = true;
                             fssp = false;
                             miss = false;
                             hit_check_df = false;
                             hit_check = false;
                            }   
                                
                                                                                                                        
                        }
                        
                }
            }    
            
            else if (!(fssp))
            
            {
                    count_ = 0;
            }    
                     
        }   
        
    }
                                                                   
    public static int getRandomNumberRange(int start, int end)
    
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }
    
}
