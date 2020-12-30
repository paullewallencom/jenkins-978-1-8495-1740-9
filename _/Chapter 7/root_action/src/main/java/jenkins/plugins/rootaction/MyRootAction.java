package jenkins.plugins.rootaction;
import hudson.Extension;
import hudson.model.RootAction;

@Extension
public class MyRootAction implements RootAction {

    public final String getDisplayName() {
        return "Root Action Example";
    }

    public final String getIconFileName() {
        return "/plugin/rootaction/myicon.png";
    }

    public final String getUrlName() {
        return "http://www.uva.nl";
    }
}
