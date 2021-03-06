package com.aurilux.xar.world.gen.layer;

import com.aurilux.xar.lib.XARWorldgen;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCorruption extends GenLayer {

	public GenLayerCorruption(long par1, GenLayer par3GenLayer)
    {
        super(par1);
        super.parent = par3GenLayer;
    }

	@Override
	public int[] getInts(int par1, int par2, int par3, int par4) {
		int[] aint = this.parent.getInts(par1 - 1, par2 - 1, par3 + 2, par4 + 2);
        int[] aint1 = IntCache.getIntCache(par3 * par4);

        for (int i1 = 0; i1 < par4; ++i1)
        {
            for (int j1 = 0; j1 < par3; ++j1)
            {
                this.initChunkSeed((long)(j1 + par1), (long)(i1 + par2));
                int k1 = aint[j1 + 1 + (i1 + 1) * (par3 + 2)];

                if (this.nextInt(3) >= 0) //== 0
                {
                    int l1 = k1;

                    if (k1 != BiomeGenBase.river.biomeID && k1 != BiomeGenBase.ocean.biomeID)
                    {
                        l1 = XARWorldgen.ABERRANT_BIOME_ID;
                    }

                    if (l1 == k1)
                    {
                        aint1[j1 + i1 * par3] = k1;
                    }
                    else
                    {
                        int i2 = aint[j1 + 1 + (i1 + 1 - 1) * (par3 + 2)];
                        int j2 = aint[j1 + 1 + 1 + (i1 + 1) * (par3 + 2)];
                        int k2 = aint[j1 + 1 - 1 + (i1 + 1) * (par3 + 2)];
                        int l2 = aint[j1 + 1 + (i1 + 1 + 1) * (par3 + 2)];

                        if (i2 == k1 && j2 == k1 && k2 == k1 && l2 == k1)
                        {
                            aint1[j1 + i1 * par3] = l1;
                        }
                        else
                        {
                            aint1[j1 + i1 * par3] = k1;
                        }
                    }
                }
                else
                {
                    aint1[j1 + i1 * par3] = k1;
                }
            }
        }
        
        return aint1;
	}
}