package cpw.mods.fml.common.registry;
import net.minecraft.block.Block;
import cn.nukkit.block.*;
public class GameRegistry {
public static void registerBlock(net.minecraft.block.Block cls,String name) {
	Class[] lis=cn.nukkit.block.Block.list;
	int id=lis.length;
	forgemod.Block blk=new forgemod.Block();
	cls.id=id;
	blk.cls=cls;
	cn.nukkit.block.Block.list[id]=blk.getClass();
}
}
