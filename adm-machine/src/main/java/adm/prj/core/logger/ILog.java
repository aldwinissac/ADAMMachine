package adm.prj.core.logger;

public interface ILog {
	void info(String message);

	void warning(String message);

	void error(String message);

	void debug(String message);
}
