/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author jocel
 */
public class FertilizerWorkRequest extends WorkRequest
{
    Object data;

    public Object getData() 
    {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
