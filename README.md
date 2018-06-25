# Basic hibernate features

## Architecture
![architecture](http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/images/architecture/data_access_layers.svg)
 
## Persistence context
#### Transient
The entity is not associated with persistence context. 
#### Persistent
The entity has an associated identifier and is associated with persistent context.
#### Detached
The entity has an associated identifier, but is no longer associated with persistent context.
#### Removed
the entity has an associated identifier and is associated with a persistence context, however it is scheduled for removal from the database. 
 
## Associations
#### One-to-Many/Many-to-One
Can be represented either through a @ManyToOne or a @OneToMany
* @ManyToOne allows map the FK column in the child entity. It can be used with @JoinColumn annotation
* @OneToOne