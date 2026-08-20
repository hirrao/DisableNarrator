package com.hirrao.disablenarrator;

import java.util.Collections;
import java.util.List;

import zone.rong.mixinbooter.ILateMixinLoader;
import zone.rong.mixinbooter.MixinLoader;

/**
 * Registers this mod's mixin configurations with MixinBooter.
 *
 * <p>MixinBooter discovers this class (via the {@code @MixinLoader} annotation
 * and/or the {@link ILateMixinLoader} interface) during the FML CONSTRUCTING
 * phase and queues every config returned by {@link #getMixinConfigs()}. This
 * happens long before {@code NarratorChatListener} is initialized during
 * {@code Minecraft#init}, so the narrator mixin is applied in time.</p>
 */
@MixinLoader
public class DisableNarratorMixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("mixins.disablenarrator.json");
    }
}
