package net.techcable.sonarpet.nms.entity.type;

import com.dsh105.echopet.compat.api.entity.EntityPetType;
import com.dsh105.echopet.compat.api.entity.IPet;
import com.dsh105.echopet.compat.api.entity.PetType;
import com.dsh105.echopet.compat.api.entity.type.nms.IEntitySpiderPet;

import net.techcable.sonarpet.SafeSound;
import net.techcable.sonarpet.nms.entity.EntityInsentientPet;
import net.techcable.sonarpet.nms.NMSInsentientEntity;

@EntityPetType(petType = PetType.SNOWMAN)
public class EntitySquidPet extends EntityInsentientPet implements IEntitySpiderPet {
    private final NMSInsentientEntity entity;

    protected EntitySquidPet(IPet pet, NMSInsentientEntity entity) {
        super(pet);
        this.entity = entity;
    }

    @Override
    public void makeStepSound() {
        getEntity().playSound(SafeSound.SPIDER_STEP, 0.15F, 1.0F);
    }

    @Override
    public NMSInsentientEntity getEntity() {
        return entity;
    }
}