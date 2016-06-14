/*
 *
 */
package org.jonu.jonumq.marshaller;

import org.jonu.jonumq.JonuMQMessage;

import java.io.DataInput;
import java.io.DataOutput;

/**
 * @author prabhato
 * @version $Revision$, $Date$, $Author$
 * @since 6/14/2016
 */
public interface JonuMQMarshaller
{
    public void marshall(JonuMQMessage message, DataOutput out);

    public void unmarshall(JonuMQMessage message, DataInput in);
}
