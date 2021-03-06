/**
 * Created on May 14, 2010.
 *
 * @author: Shang-Wen Cheng <Shang-Wen.Cheng@jpl.nasa.gov>
 */
#include <qf_port.h>

/**
 * User event for a key press.
 */
typedef struct KeyEvent {
    QEvent super;
	char keyId;
} KeyEvent;

/**
 * User event for computation result.
 */
typedef struct ResultEvent {
    QEvent super;
	char result[256];
} ResultEvent;
