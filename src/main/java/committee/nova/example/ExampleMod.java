package committee.nova.example;

import io.shcm.shsupercm.fabric.fletchingtable.api.Entrypoint;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entrypoint("main") // For automatically registering the entrypoint
public class ExampleMod implements ModInitializer {
    public static final String MOD_ID = "modid";
    public static final Logger LOGGER = LoggerFactory.getLogger("Example Mod");

    @Override
    public void onInitialize() {
        LOGGER.info("Initialized.");
    }
}
