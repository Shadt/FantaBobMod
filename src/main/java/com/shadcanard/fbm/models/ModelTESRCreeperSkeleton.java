// Date: 03/10/2016 15:17:01
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.shadcanard.fbm.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTESRCreeperSkeleton extends ModelBase
{
  //fields
    ModelRenderer Shape2;
    ModelRenderer xTopRight;
    ModelRenderer xTopLeft;
    ModelRenderer xBottomLeft;
    ModelRenderer xBottomRight;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer leg1;
    ModelRenderer leg2;
  
  public ModelTESRCreeperSkeleton()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape2 = new ModelRenderer(this, 32, 0);
    Shape2.mirror = true;
      Shape2.addBox(-4F, 0F, -4F, 8, 8, 8);
      Shape2.setRotationPoint(0F, 11F, 0F);
      Shape2.setTextureSize(64, 32);
      setRotation(Shape2, 0F, 0F, 0F);
      xTopRight = new ModelRenderer(this, 0, 0);
    xTopRight.mirror = true;
      xTopRight.addBox(-2F, 0F, 0F, 2, 1, 1);
      xTopRight.setRotationPoint(-1F, 7F, -0.5333334F);
      xTopRight.setTextureSize(64, 32);
      setRotation(xTopRight, 0F, 0F, 0F);
      xTopLeft = new ModelRenderer(this, 0, 0);
    xTopLeft.mirror = true;
      xTopLeft.addBox(0F, 0F, 0F, 2, 1, 1);
      xTopLeft.setRotationPoint(1F, 7F, -0.5F);
      xTopLeft.setTextureSize(64, 32);
      setRotation(xTopLeft, 0F, 0F, 0F);
      xBottomLeft = new ModelRenderer(this, 0, 0);
    xBottomLeft.mirror = true;
      xBottomLeft.addBox(0F, 0F, 0F, 2, 1, 1);
      xBottomLeft.setRotationPoint(1F, 9F, -0.5F);
      xBottomLeft.setTextureSize(64, 32);
      setRotation(xBottomLeft, 0F, 0F, 0F);
      xBottomRight = new ModelRenderer(this, 0, 0);
    xBottomRight.mirror = true;
      xBottomRight.addBox(-2F, 0F, 0F, 2, 1, 1);
      xBottomRight.setRotationPoint(-1F, 9F, -0.5F);
      xBottomRight.setTextureSize(64, 32);
      setRotation(xBottomRight, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 0);
    head.mirror = true;
      head.addBox(-4F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(0F, 6F, 0F);
      head.setTextureSize(64, 32);
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
    body.mirror = true;
      body.addBox(-1F, 0F, -1F, 2, 12, 2);
      body.setRotationPoint(0F, 6F, 0F);
      body.setTextureSize(64, 32);
      setRotation(body, 0F, 0F, 0F);
      leg3 = new ModelRenderer(this, 0, 16);
    leg3.mirror = true;
      leg3.addBox(-1F, 0F, -2F, 2, 6, 4);
      leg3.setRotationPoint(-2F, 18F, -4F);
      leg3.setTextureSize(64, 32);
      setRotation(leg3, 0F, 0F, 0F);
      leg4 = new ModelRenderer(this, 0, 16);
    leg4.mirror = true;
      leg4.addBox(-1F, 0F, -2F, 2, 6, 4);
      leg4.setRotationPoint(2F, 18F, -4F);
      leg4.setTextureSize(64, 32);
      setRotation(leg4, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 16);
    leg1.mirror = true;
      leg1.addBox(0F, 0F, -2F, 2, 6, 4);
      leg1.setRotationPoint(-3F, 18F, 4F);
      leg1.setTextureSize(64, 32);
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 16);
    leg2.mirror = true;
      leg2.addBox(-2F, 0F, -2F, 2, 6, 4);
      leg2.setRotationPoint(3F, 18F, 4F);
      leg2.setTextureSize(64, 32);
      setRotation(leg2, 0F, 0F, 0F);
  }
  
public void renderAll(){
    Shape2.render(0.0625F);
    xTopRight.render(0.0625F);
    xTopLeft.render(0.0625F);
    xBottomLeft.render(0.0625F);
    xBottomRight.render(0.0625F);
    head.render(0.0625F);
    body.render(0.0625F);
    leg3.render(0.0625F);
    leg4.render(0.0625F);
    leg1.render(0.0625F);
    leg2.render(0.0625F);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
