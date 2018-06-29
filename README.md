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
* One-To-Many can be used by @OneToMany annotation with collection of child in the parent entity.
* Many-To-One allows map the FK column in the child entity. It can be used with @JoinColumn and @ManyToOne annotation with parent reference in child
* One-To-One unidirectional can be used with @OneToOne and @PrimaryKeyJoinColumn with parent reference from the child side.

## Lazy loading
