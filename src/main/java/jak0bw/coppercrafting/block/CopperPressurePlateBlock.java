package jak0bw.coppercrafting.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.entity.Entity;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

import java.util.List;

public class CopperPressurePlateBlock extends WeightedPressurePlateBlock {
    protected static final Box BOX_BIG = new Box(0.0, 0.0, 0.0, 1.0, 0.25, 1.0);

    public CopperPressurePlateBlock(AbstractBlock.Settings settings) {
        super(15, BlockSetType.COPPER, settings);
    }

    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        Box box = BOX_BIG.offset(pos);
        List<Entity> entities = world.getEntitiesByClass(Entity.class, box, EntityPredicates.EXCEPT_SPECTATOR.and(entity -> !entity.canAvoidTraps()));

        int total = 0;
        for (Entity entity : entities) {
            if (entity instanceof net.minecraft.entity.ItemEntity itemEntity) {
                total += itemEntity.getStack().getCount();
            } else {
                total += 1;
            }
        }
        return Math.min(15, total);
    }
} 