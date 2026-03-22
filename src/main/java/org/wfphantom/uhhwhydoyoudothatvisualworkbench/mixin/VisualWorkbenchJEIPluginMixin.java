package org.wfphantom.uhhwhydoyoudothatvisualworkbench.mixin;

import mezz.jei.api.registration.IRecipeTransferRegistration;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import fuzs.visualworkbench.integration.jei.VisualWorkbenchJEIPlugin;

@Mixin(VisualWorkbenchJEIPlugin.class)
public class VisualWorkbenchJEIPluginMixin {
    @Inject(method = "registerRecipeTransferHandlers", at = @At("HEAD"), cancellable = true)
    private void disableRecipeTransferHandlers(IRecipeTransferRegistration registration, CallbackInfo ci) {
        ci.cancel();
    }
}