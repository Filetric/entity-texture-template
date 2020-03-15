// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public class custom_model extends ModelBase {
	private final ModelRenderer bb_main;
	private final ModelRenderer Corps;
	private final ModelRenderer brasgauche;
	private final ModelRenderer brasdroit;
	private final ModelRenderer epaulegauche;
	private final ModelRenderer epauledroite;

	public custom_model() {
		textureWidth = 150;
		textureHeight = 150;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 2.0F, -1.0F, -1.0F, 3, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -5.0F, 3.0F, 3, 5, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 2.0F, -5.0F, 3.0F, 3, 5, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -1.0F, -1.0F, 3, 1, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -19.0F, 2.0F, 4, 2, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -20.0F, 0.0F, 6, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -20.0F, -1.0F, 4, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -19.0F, 1.0F, 4, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -19.0F, 6.0F, 4, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 2.0F, -19.0F, 2.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -19.0F, 2.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -28.0F, -2.0F, 8, 8, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -29.0F, -1.0F, 8, 1, 9, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -30.0F, 0.0F, 6, 1, 7, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 4.0F, -28.0F, -1.0F, 1, 7, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 5.0F, -27.0F, 2.0F, 2, 4, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -27.0F, 2.0F, 2, 4, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -28.0F, -1.0F, 1, 7, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -28.0F, 8.0F, 6, 7, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -2.0F, -27.0F, 9.0F, 4, 5, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 1.0F, -25.0F, -3.0F, 3, 4, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 2.0F, -24.0F, -4.0F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -24.0F, -4.0F, 1, 2, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -4.0F, -25.0F, -3.0F, 3, 4, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -1.0F, -25.0F, -4.0F, 2, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -13.0F, -9.0F, 10, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 5.0F, -14.0F, -9.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 6.0F, -15.0F, -9.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 7.0F, -16.0F, -9.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 8.0F, -17.0F, -9.0F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -15.0F, -9.0F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -16.0F, -9.0F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -14.0F, -9.0F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -14.0F, -10.0F, 10, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 1.0F, -15.0F, -10.0F, 5, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -15.0F, -10.0F, 5, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 3.0F, -16.0F, -10.0F, 4, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -16.0F, -10.0F, 5, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 4.0F, -17.0F, -10.0F, 4, 1, 5, 0.0F, false));

		Corps = new ModelRenderer(this);
		Corps.setRotationPoint(0.0F, 25.0F, 0.0F);
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -6.0F, -7.0F, 1.0F, 12, 1, 6, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -5.0F, -18.0F, 1.0F, 10, 11, 6, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -5.0F, -7.0F, 0.0F, 10, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -4.0F, -8.0F, 0.0F, 8, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -4.0F, -8.0F, 7.0F, 8, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -2.0F, -10.0F, 0.0F, 4, 2, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -2.0F, -10.0F, 7.0F, 4, 2, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -2.0F, -8.0F, -1.0F, 4, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -6.0F, -8.0F, 2.0F, 1, 1, 4, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, 5.0F, -8.0F, 2.0F, 1, 1, 4, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, 6.0F, -7.0F, 2.0F, 1, 1, 4, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -7.0F, -7.0F, 2.0F, 1, 1, 4, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -2.0F, -8.0F, 8.0F, 4, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -5.0F, -7.0F, 7.0F, 10, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -4.0F, -7.0F, -1.0F, 8, 1, 1, 0.0F, false));
		Corps.cubeList.add(new ModelBox(Corps, 0, 0, -4.0F, -7.0F, 8.0F, 8, 1, 1, 0.0F, false));

		brasgauche = new ModelRenderer(this);
		brasgauche.setRotationPoint(-8.5F, 6.5F, -5.0F);
		setRotationAngle(brasgauche, 0.9599F, 0.0F, 0.0F);
		brasgauche.cubeList.add(new ModelBox(brasgauche, 0, 0, -1.5F, 6.6068F, -3.9196F, 3, 3, 10, 0.0F, false));
		brasgauche.cubeList.add(new ModelBox(brasgauche, 0, 0, -1.5F, -0.3932F, -6.9196F, 3, 10, 3, 0.0F, false));

		brasdroit = new ModelRenderer(this);
		brasdroit.setRotationPoint(8.5F, 6.0321F, -5.2856F);
		setRotationAngle(brasdroit, 0.9599F, 0.0F, 0.0F);
		brasdroit.cubeList.add(new ModelBox(brasdroit, 0, 0, -1.5F, 6.6068F, -3.9196F, 3, 3, 10, 0.0F, false));
		brasdroit.cubeList.add(new ModelBox(brasdroit, 0, 0, -1.5F, -0.3932F, -6.9196F, 3, 10, 3, 0.0F, false));

		epaulegauche = new ModelRenderer(this);
		epaulegauche.setRotationPoint(0.0F, 24.0F, 0.0F);
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -7.0F, -17.0F, 2.0F, 2, 2, 4, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -6.0F, -17.0F, 6.0F, 1, 2, 1, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -6.0F, -17.0F, 1.0F, 1, 2, 1, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -6.0F, -15.0F, 2.0F, 1, 1, 4, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -7.0F, -15.0F, 3.0F, 1, 1, 2, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -6.0F, -18.0F, 6.0F, 2, 1, 1, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -6.0F, -18.0F, 1.0F, 2, 1, 1, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -5.0F, -19.0F, 2.0F, 2, 2, 4, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -7.0F, -19.0F, 2.0F, 2, 2, 4, 0.0F, false));
		epaulegauche.cubeList.add(new ModelBox(epaulegauche, 0, 0, -6.0F, -20.0F, 3.0F, 2, 1, 2, 0.0F, false));

		epauledroite = new ModelRenderer(this);
		epauledroite.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(epauledroite, 0.0F, 3.1416F, 0.0F);
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -7.0F, -17.0F, -6.0F, 2, 2, 4, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -6.0F, -17.0F, -2.0F, 1, 2, 1, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -6.0F, -17.0F, -7.0F, 1, 2, 1, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -6.0F, -15.0F, -6.0F, 1, 1, 4, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -7.0F, -15.0F, -5.0F, 1, 1, 2, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -6.0F, -18.0F, -2.0F, 2, 1, 1, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -6.0F, -18.0F, -7.0F, 2, 1, 1, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -5.0F, -19.0F, -6.0F, 2, 2, 4, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -7.0F, -19.0F, -6.0F, 2, 2, 4, 0.0F, false));
		epauledroite.cubeList.add(new ModelBox(epauledroite, 0, 0, -6.0F, -20.0F, -5.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
		Corps.render(f5);
		brasgauche.render(f5);
		brasdroit.render(f5);
		epaulegauche.render(f5);
		epauledroite.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}